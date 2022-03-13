package com.serhat.licensingservice.controllers;

import com.serhat.licensingservice.model.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @GetMapping(value="/{licenseId}")
    public String getLicenses(@PathVariable("organizationId") String organizationId,
                               @PathVariable("licenseId") String licenseId){
        //return licenseService.getLicense(licenseId);
        return "hello";

    }

    @PutMapping(value="{licenseId}")
    public String updateLicenses( @PathVariable("licenseId") String licenseId) {
        return String.format("This is the put");
    }

    @PostMapping(value="{licenseId}")
    public String saveLicenses( @PathVariable("licenseId") String licenseId) {
        return String.format("This is the post");
    }

    @DeleteMapping(value="{licenseId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicenses( @PathVariable("licenseId") String licenseId) {
        return String.format("This is the Delete");
    }
}
