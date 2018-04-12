package com.wifikey.entities;

import com.wifikey.entities.RolePermissions;
import com.wifikey.entities.UserRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-12T01:22:16")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, RolePermissions> rolePermissions;
    public static volatile SingularAttribute<Roles, String> name;
    public static volatile SingularAttribute<Roles, Integer> id;
    public static volatile ListAttribute<Roles, UserRoles> userRolesList;

}