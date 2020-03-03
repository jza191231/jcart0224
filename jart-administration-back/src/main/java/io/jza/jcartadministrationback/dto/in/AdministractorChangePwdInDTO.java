package io.jza.jcartadministrationback.dto.in;

public class AdministractorChangePwdInDTO {
    private String originPwd;
    private String newPwd;

    public String getOriginPwd() {
        return originPwd;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setOriginPwd(String originPwd) {
        this.originPwd = originPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }
}
