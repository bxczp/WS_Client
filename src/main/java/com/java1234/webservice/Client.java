package com.java1234.webservice;

import java.util.List;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.java1234.interceptor.AddHeaderInterceptor;

public class Client {

	public static void main(String[] args) {
		HelloWorldService service=new HelloWorldService();
		HelloWorld helloWorld=service.getHelloWorldPort();
		org.apache.cxf.endpoint.Client client=ClientProxy.getClient(helloWorld);
		
		client.getOutInterceptors().add(new AddHeaderInterceptor("java1234","123456")); // ����Զ���������
		client.getInInterceptors().add(new LoggingInInterceptor()); // ���In������ ��־������
		client.getOutInterceptors().add(new LoggingOutInterceptor()); // ���Out������ ��־������
		//System.out.println(helloWorld.say("java1234_С��"));
		
		/*User user=new User();
		user.setUserName("jack");
		user.setPassword("123456");
		List<Role> roleList=helloWorld.getRoleByUser(user);
		for(Role role:roleList){
			System.out.println(role.getId()+","+role.getRoleName());
		}*/
		
		MyRoleArray arry=helloWorld.getRoles();
		List<MyRole> roleList=arry.item;
		for(int i=0;i<roleList.size();i++){
			MyRole my=roleList.get(i);
			System.out.print(my.key+":");
			for(Role r:my.value){
				System.out.print(r.getId()+","+r.getRoleName());
			}
			System.out.println("============");
		}
	}
}
