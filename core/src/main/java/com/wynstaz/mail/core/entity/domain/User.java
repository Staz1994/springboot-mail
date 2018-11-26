package com.wynstaz.mail.core.entity.domain;

import java.io.Serializable;

/**
 * TODO
 *
 * @author: wyn
 * @Date: 2018/11/13 16:35
 */
public class User implements Serializable {

    private static final long serialVersionUID = -1252857282837926429L;
    private Long id;

    private String name;

    private String mail;

    private String realName;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
