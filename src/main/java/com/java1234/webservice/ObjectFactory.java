
package com.java1234.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.java1234.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetRoleByUser_QNAME = new QName("http://webservice.java1234.com/", "getRoleByUser");
    private final static QName _GetRoleByUserResponse_QNAME = new QName("http://webservice.java1234.com/", "getRoleByUserResponse");
    private final static QName _GetRoles_QNAME = new QName("http://webservice.java1234.com/", "getRoles");
    private final static QName _GetRolesResponse_QNAME = new QName("http://webservice.java1234.com/", "getRolesResponse");
    private final static QName _Say_QNAME = new QName("http://webservice.java1234.com/", "say");
    private final static QName _SayResponse_QNAME = new QName("http://webservice.java1234.com/", "sayResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.java1234.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoleByUser }
     * 
     */
    public GetRoleByUser createGetRoleByUser() {
        return new GetRoleByUser();
    }

    /**
     * Create an instance of {@link GetRoleByUserResponse }
     * 
     */
    public GetRoleByUserResponse createGetRoleByUserResponse() {
        return new GetRoleByUserResponse();
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link Say }
     * 
     */
    public Say createSay() {
        return new Say();
    }

    /**
     * Create an instance of {@link SayResponse }
     * 
     */
    public SayResponse createSayResponse() {
        return new SayResponse();
    }

    /**
     * Create an instance of {@link MyRole }
     * 
     */
    public MyRole createMyRole() {
        return new MyRole();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link MyRoleArray }
     * 
     */
    public MyRoleArray createMyRoleArray() {
        return new MyRoleArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "getRoleByUser")
    public JAXBElement<GetRoleByUser> createGetRoleByUser(GetRoleByUser value) {
        return new JAXBElement<GetRoleByUser>(_GetRoleByUser_QNAME, GetRoleByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "getRoleByUserResponse")
    public JAXBElement<GetRoleByUserResponse> createGetRoleByUserResponse(GetRoleByUserResponse value) {
        return new JAXBElement<GetRoleByUserResponse>(_GetRoleByUserResponse_QNAME, GetRoleByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "getRoles")
    public JAXBElement<GetRoles> createGetRoles(GetRoles value) {
        return new JAXBElement<GetRoles>(_GetRoles_QNAME, GetRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "getRolesResponse")
    public JAXBElement<GetRolesResponse> createGetRolesResponse(GetRolesResponse value) {
        return new JAXBElement<GetRolesResponse>(_GetRolesResponse_QNAME, GetRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Say }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "say")
    public JAXBElement<Say> createSay(Say value) {
        return new JAXBElement<Say>(_Say_QNAME, Say.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "sayResponse")
    public JAXBElement<SayResponse> createSayResponse(SayResponse value) {
        return new JAXBElement<SayResponse>(_SayResponse_QNAME, SayResponse.class, null, value);
    }

}
