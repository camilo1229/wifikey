package com.wifikey.entities;

import com.wifikey.entities.Roles;
import com.wifikey.entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-12T01:22:16")
@StaticMetamodel(UserRoles.class)
public class UserRoles_ { 

    public static volatile SingularAttribute<UserRoles, Roles> roleId;
    public static volatile SingularAttribute<UserRoles, Integer> id;
    public static volatile SingularAttribute<UserRoles, Users> userId;

}