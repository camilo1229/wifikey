package com.wifikey.entities;

import com.wifikey.entities.Connections;
import com.wifikey.entities.UserRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-12T01:22:16")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile ListAttribute<Users, Connections> connectionsList;
    public static volatile SingularAttribute<Users, String> name;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, String> userName;
    public static volatile SingularAttribute<Users, String> surnames;
    public static volatile ListAttribute<Users, UserRoles> userRolesList;

}