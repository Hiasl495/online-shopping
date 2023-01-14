package edu.project.application.web.dto;

import edu.project.application.application.Roles;
import java.util.List;

public class UserDto {
    private String name;
    private List<Roles> roles;

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
