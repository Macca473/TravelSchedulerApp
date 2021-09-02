package travelScheduler.springframework.travelSchedulerApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Location {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String UserName;
    private Date CurDate;
    private Date ReqDate;
    private String CityName;
    private String CityCode;
    private String CountryName;
    private String Temperature;
    private String Clouds;

    public Location() {
    }

    public Location(String userName, Date curDate, Date reqDate, String cityName, String cityCode, String countryName, String temperature, String clouds) {
        UserName = userName;
        CurDate = curDate;
        ReqDate = reqDate;
        CityName = cityName;
        CityCode = cityCode;
        CountryName = countryName;
        Temperature = temperature;
        Clouds = clouds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Date getCurDate() {
        return CurDate;
    }

    public void setCurDate(Date curDate) {
        CurDate = curDate;
    }

    public Date getReqDate() {
        return ReqDate;
    }

    public void setReqDate(Date reqDate) {
        ReqDate = reqDate;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) { CityName = cityName; }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) { CountryName = countryName; }

    public String getCityCode() {
        return CityCode;
    }

    public void setCityCode(String cityCode) {
        CityCode = cityCode;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    public String getClouds() {
        return Clouds;
    }

    public void setClouds(String clouds) {
        Clouds = clouds;
    }
}
