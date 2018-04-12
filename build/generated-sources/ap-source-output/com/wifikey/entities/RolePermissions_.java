package com.wifikey.entities;

import com.wifikey.entities.Permissions;
import com.wifikey.entities.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-12T01:22:16")
@StaticMetamodel(RolePermissions.class)
public class RolePermissions_ { 

    public static volatile SingularAttribute<RolePermissions, Permissions> permissionId;
    public static volatile SingularAttribute<RolePermissions, Integer> roleId;
    public static volatile SingularAttribute<RolePermissions, Roles> roles;
    public static volatile SingularAttribute<RolePermissions, Integer> id;

}