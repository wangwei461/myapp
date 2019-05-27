package com.ww.myapp.entity.rs;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Date;

@JsonRootName(value = "response")
public class ResponseMsg<T> {

    @JsonProperty(value = "id")
    private String serviceId;
    @JsonProperty(value = "name")
    private String serviceName;
    @JsonProperty(value = "code")
    private String serviceCode;
    @JsonProperty(value = "status")
    private String serviceStatus;
    @JsonProperty(value = "errors")
    private String serviceErrors;
    @JsonProperty(value = "data")
    private T serviceData;

    public ResponseMsg(){
    }

    public ResponseMsg(String serviceId, String serviceName, String serviceCode, String serviceStatus, String serviceErrors,
                T serviceData ){
        this.serviceId = serviceId;
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.serviceStatus = serviceStatus;
        this.serviceErrors = serviceErrors;
        this.serviceData = serviceData;
    }

    // 回复时间
    @JsonProperty("date")
    private Date responseDate;

    // 请求耗时：毫秒
    @JsonProperty(value = "time")
    private Double consumeTime;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getServiceErrors() {
        return serviceErrors;
    }

    public void setServiceErrors(String serviceErrors) {
        this.serviceErrors = serviceErrors;
    }

    public T getServiceData() {
        return serviceData;
    }

    public void setServiceData(T serviceData) {
        this.serviceData = serviceData;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }
}
