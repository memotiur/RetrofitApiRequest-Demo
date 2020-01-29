package com.pixonlab.retrofitapirequest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("role_id")
    @Expose
    private Integer roleId;
    @SerializedName("flag")
    @Expose
    private Integer flag;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("division_id")
    @Expose
    private Integer divisionId;
    @SerializedName("district_id")
    @Expose
    private Integer districtId;
    @SerializedName("upazila_id")
    @Expose
    private Integer upazilaId;
    @SerializedName("union_id")
    @Expose
    private Integer unionId;
    @SerializedName("village_id")
    @Expose
    private Integer villageId;
    @SerializedName("is_active")
    @Expose
    private Integer isActive;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("email_verified_at")
    @Expose
    private Object emailVerifiedAt;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("remember_token")
    @Expose
    private Object rememberToken;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("fathers_name")
    @Expose
    private Object fathersName;
    @SerializedName("mothers_name")
    @Expose
    private Object mothersName;
    @SerializedName("age")
    @Expose
    private Object age;
    @SerializedName("sex")
    @Expose
    private Object sex;
    @SerializedName("national_id")
    @Expose
    private Object nationalId;
    @SerializedName("present_address")
    @Expose
    private Object presentAddress;
    @SerializedName("permanent_address")
    @Expose
    private Object permanentAddress;
    @SerializedName("marital_status")
    @Expose
    private Object maritalStatus;
    @SerializedName("occupation")
    @Expose
    private Object occupation;
    @SerializedName("blood_group")
    @Expose
    private Object bloodGroup;
    @SerializedName("religion")
    @Expose
    private Object religion;
    @SerializedName("date_of_birth")
    @Expose
    private Object dateOfBirth;
    @SerializedName("photo")
    @Expose
    private Object photo;
    @SerializedName("designation")
    @Expose
    private Object designation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getUpazilaId() {
        return upazilaId;
    }

    public void setUpazilaId(Integer upazilaId) {
        this.upazilaId = upazilaId;
    }

    public Integer getUnionId() {
        return unionId;
    }

    public void setUnionId(Integer unionId) {
        this.unionId = unionId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Object getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public void setEmailVerifiedAt(Object emailVerifiedAt) {
        this.emailVerifiedAt = emailVerifiedAt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(Object rememberToken) {
        this.rememberToken = rememberToken;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getFathersName() {
        return fathersName;
    }

    public void setFathersName(Object fathersName) {
        this.fathersName = fathersName;
    }

    public Object getMothersName() {
        return mothersName;
    }

    public void setMothersName(Object mothersName) {
        this.mothersName = mothersName;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public Object getNationalId() {
        return nationalId;
    }

    public void setNationalId(Object nationalId) {
        this.nationalId = nationalId;
    }

    public Object getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(Object presentAddress) {
        this.presentAddress = presentAddress;
    }

    public Object getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Object permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Object getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Object maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Object getOccupation() {
        return occupation;
    }

    public void setOccupation(Object occupation) {
        this.occupation = occupation;
    }

    public Object getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(Object bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Object getReligion() {
        return religion;
    }

    public void setReligion(Object religion) {
        this.religion = religion;
    }

    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Object getPhoto() {
        return photo;
    }

    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    public Object getDesignation() {
        return designation;
    }

    public void setDesignation(Object designation) {
        this.designation = designation;
    }

}


