/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wifikey.entities;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camilo
 */
@Entity
@Table(name = "role_permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolePermissions.findAll", query = "SELECT r FROM RolePermissions r")
    , @NamedQuery(name = "RolePermissions.findById", query = "SELECT r FROM RolePermissions r WHERE r.id = :id")
    , @NamedQuery(name = "RolePermissions.findByRoleId", query = "SELECT r FROM RolePermissions r WHERE r.roleId = :roleId")})
public class RolePermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "role_id")
    private int roleId;
    @JoinColumn(name = "permission_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Permissions permissionId;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Roles roles;

    public RolePermissions() {
    }

    public RolePermissions(Integer id) {
        this.id = id;
    }

    public RolePermissions(Integer id, int roleId) {
        this.id = id;
        this.roleId = roleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Permissions getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Permissions permissionId) {
        this.permissionId = permissionId;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
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
        if (!(object instanceof RolePermissions)) {
            return false;
        }
        RolePermissions other = (RolePermissions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wifikey.entities.RolePermissions[ id=" + id + " ]";
    }
    
}
