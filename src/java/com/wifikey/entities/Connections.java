/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wifikey.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camilo
 */
@Entity
@Table(name = "connections")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Connections.findAll", query = "SELECT c FROM Connections c")
    , @NamedQuery(name = "Connections.findById", query = "SELECT c FROM Connections c WHERE c.id = :id")
    , @NamedQuery(name = "Connections.findByStatus", query = "SELECT c FROM Connections c WHERE c.status = :status")
    , @NamedQuery(name = "Connections.findByConnectionDate", query = "SELECT c FROM Connections c WHERE c.connectionDate = :connectionDate")
    , @NamedQuery(name = "Connections.findByConnectionTime", query = "SELECT c FROM Connections c WHERE c.connectionTime = :connectionTime")})
public class Connections implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "connection_date")
    @Temporal(TemporalType.DATE)
    private Date connectionDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "connection_time")
    @Temporal(TemporalType.TIME)
    private Date connectionTime;
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Devices deviceId;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users userId;

    public Connections() {
    }

    public Connections(Integer id) {
        this.id = id;
    }

    public Connections(Integer id, String status, Date connectionDate, Date connectionTime) {
        this.id = id;
        this.status = status;
        this.connectionDate = connectionDate;
        this.connectionTime = connectionTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getConnectionDate() {
        return connectionDate;
    }

    public void setConnectionDate(Date connectionDate) {
        this.connectionDate = connectionDate;
    }

    public Date getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(Date connectionTime) {
        this.connectionTime = connectionTime;
    }

    public Devices getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Devices deviceId) {
        this.deviceId = deviceId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Connections)) {
            return false;
        }
        Connections other = (Connections) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wifikey.entities.Connections[ id=" + id + " ]";
    }
    
}
