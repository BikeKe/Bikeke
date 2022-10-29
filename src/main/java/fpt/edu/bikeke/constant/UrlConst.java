package fpt.edu.bikeke.constant;

public class UrlConst {
//    Authenticate
    public static final String ADMIN_AUTHENTICATE = "/auth/login-admin";
    public static final String CUSTOMER_AUTHENTICATE = "/auth/login-customer";
    public static final String DRIVER_AUTHENTICATE = "/auth/login-driver";

//    Role\
    public static final String ROLE = "/role";
    public static final String ROLE_FIND_ALL = "/role/all";
    public static final String ROLE_FIND = "/role/{id}";

//    Customer
    public static final String CUSTOMER = "/customer";
    public static final String CUSTOMER_FIND_ALL = "/customer/all";
    public static final String CUSTOMER_FIND = "/customer/{id}";

//    Driver
    public static final String DRIVER = "/driver";
    public static final String DRIVER_FIND_ALL = "/driver/all";
}
