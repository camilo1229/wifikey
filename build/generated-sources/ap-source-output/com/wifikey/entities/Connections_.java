package com.wifikey.entities;

import com.wifikey.entities.Devices;
import com.wifikey.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-12T01:22:16")
@StaticMetamodel(Connections.class)
public class Connections_ { 

    public static volatile SingularAttribute<Connections, Date> connectionDate;
    public static volatile SingularAttribute<Connections, Integer> id;
    public static volatile SingularAttribute<Connections, Devices> deviceId;
    public static volatile SingularAttribute<Connections, Users> userId;
    public static volatile SingularAttribute<Connections, Date> connectionTime;
    public static volatile SingularAttribute<Connections, String> status;

}