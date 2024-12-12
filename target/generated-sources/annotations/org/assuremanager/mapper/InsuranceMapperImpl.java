package org.assuremanager.mapper;

import javax.annotation.processing.Generated;
import org.assuremanager.dto.request.CarInsuranceRequest;
import org.assuremanager.dto.request.HealthInsuranceRequest;
import org.assuremanager.dto.request.HomeInsuranceRequest;
import org.assuremanager.dto.response.CarInsuranceDto;
import org.assuremanager.dto.response.HealthInsuranceDto;
import org.assuremanager.dto.response.HomeInsuranceDto;
import org.assuremanager.model.CarInsurance;
import org.assuremanager.model.HealthInsurance;
import org.assuremanager.model.HomeInsurance;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-12T10:17:28+0100",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class InsuranceMapperImpl implements InsuranceMapper {

    @Override
    public HealthInsurance toEntity(HealthInsuranceRequest dto) {
        if ( dto == null ) {
            return null;
        }

        HealthInsurance healthInsurance = new HealthInsurance();

        healthInsurance.setAge( dto.getAge() );
        healthInsurance.setHealthStatus( dto.getHealthStatus() );
        healthInsurance.setCoverageType( dto.getCoverageType() );

        return healthInsurance;
    }

    @Override
    public HealthInsuranceDto toResponseDTO(HealthInsurance entity) {
        if ( entity == null ) {
            return null;
        }

        HealthInsuranceDto healthInsuranceDto = new HealthInsuranceDto();

        healthInsuranceDto.setAge( entity.getAge() );
        healthInsuranceDto.setHealthStatus( entity.getHealthStatus() );
        healthInsuranceDto.setCoverageType( entity.getCoverageType() );

        return healthInsuranceDto;
    }

    @Override
    public HomeInsurance toEntity(HomeInsuranceRequest dto) {
        if ( dto == null ) {
            return null;
        }

        HomeInsurance homeInsurance = new HomeInsurance();

        homeInsurance.setLocation( dto.getLocation() );
        homeInsurance.setPropertyValue( dto.getPropertyValue() );
        homeInsurance.setSecuritySystem( dto.getSecuritySystem() );
        homeInsurance.setPropertyType( dto.getPropertyType() );
        homeInsurance.setRisqueZone( dto.isRisqueZone() );

        return homeInsurance;
    }

    @Override
    public HomeInsuranceDto toResponseDTO(HomeInsurance entity) {
        if ( entity == null ) {
            return null;
        }

        HomeInsuranceDto homeInsuranceDto = new HomeInsuranceDto();

        homeInsuranceDto.setPropertyValue( entity.getPropertyValue() );
        homeInsuranceDto.setSecuritySystem( entity.getSecuritySystem() );
        homeInsuranceDto.setLocation( entity.getLocation() );
        homeInsuranceDto.setPropertyType( entity.getPropertyType() );
        homeInsuranceDto.setRisqueZone( entity.isRisqueZone() );

        return homeInsuranceDto;
    }

    @Override
    public CarInsurance toEntity(CarInsuranceRequest dto) {
        if ( dto == null ) {
            return null;
        }

        CarInsurance carInsurance = new CarInsurance();

        carInsurance.setDriverAge( dto.getDriverAge() );
        carInsurance.setVehicleModel( dto.getVehicleModel() );
        carInsurance.setVehicleBrand( dto.getVehicleBrand() );
        carInsurance.setUsage( dto.getUsage() );
        carInsurance.setVehicleType( dto.getVehicleType() );
        carInsurance.setDrivingHistory( dto.getDrivingHistory() );

        return carInsurance;
    }

    @Override
    public CarInsuranceDto toResponseDTO(CarInsurance entity) {
        if ( entity == null ) {
            return null;
        }

        CarInsuranceDto carInsuranceDto = new CarInsuranceDto();

        carInsuranceDto.setDriverAge( entity.getDriverAge() );
        carInsuranceDto.setVehicleBrand( entity.getVehicleBrand() );
        carInsuranceDto.setVehicleModel( entity.getVehicleModel() );
        carInsuranceDto.setUsage( entity.getUsage() );
        carInsuranceDto.setVehicleType( entity.getVehicleType() );
        carInsuranceDto.setDrivingHistory( entity.getDrivingHistory() );

        return carInsuranceDto;
    }
}
