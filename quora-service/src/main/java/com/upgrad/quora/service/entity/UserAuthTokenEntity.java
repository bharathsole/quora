package com.upgrad.quora.service.entity;

//@Entity
//@Table(name = "user_auth")
//@NamedQueries({
//        @NamedQuery(name = "userAuthTokenByAccessToken" , query = "select ut from UserAuthTokenEntity ut where ut.accessToken = :accessToken ")
//})
//public class UserAuthTokenEntity implements Serializable {
//
//
//    @Id
//    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    public String getUuid() {
//        return uuid;
//    }
//
//    public void setUuid(String uuid) {
//        this.uuid = uuid;
//    }
//
//    @Column(name = "uuid")
//    private String uuid;
//
//    @ManyToOne
//    @JoinColumn(name = "USER_ID")
//    private UserEntity user;
//
//    @Column(name = "ACCESS_TOKEN")
//    @NotNull
//    @Size(max = 500)
//    private String accessToken;
//
//    @Column(name = "LOGIN_AT")
//    @NotNull
//    private ZonedDateTime loginAt;
//
//    @Column(name = "EXPIRES_AT")
//    @NotNull
//    private ZonedDateTime expiresAt;
//
//    @Column(name = "LOGOUT_AT")
//    private ZonedDateTime logoutAt;
//
//
////    @Version
////    @Column(name="VERSION" , length=19 , nullable = false)
////    private Long version;
////
////
////    @Column(name="CREATED_BY")
////    @NotNull
////    private String createdBy;
////
////
////    @Column(name="CREATED_AT")
////    @NotNull
////    private ZonedDateTime createdAt;
////
////    @Column(name="MODIFIED_BY")
////    private String modifiedBy;
////
////    @Column(name="MODIFIED_AT")
////    private ZonedDateTime modifiedAt;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public UserEntity getUser() {
//        return user;
//    }
//
//    public void setUser(UserEntity user) {
//        this.user = user;
//    }
//
//    public String getAccessToken() {
//        return accessToken;
//    }
//
//    public void setAccessToken(String accessToken) {
//        this.accessToken = accessToken;
//    }
//
//    public ZonedDateTime getLoginAt() {
//        return loginAt;
//    }
//
//    public void setLoginAt(ZonedDateTime loginAt) {
//        this.loginAt = loginAt;
//    }
//
//    public ZonedDateTime getExpiresAt() {
//        return expiresAt;
//    }
//
//    public void setExpiresAt(ZonedDateTime expiresAt) {
//        this.expiresAt = expiresAt;
//    }
//
//    public ZonedDateTime getLogoutAt() {
//        return logoutAt;
//    }
//
//    public void setLogoutAt(ZonedDateTime logoutAt) {
//        this.logoutAt = logoutAt;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return new EqualsBuilder().append(this, obj).isEquals();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(this).hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
//    }
//}
