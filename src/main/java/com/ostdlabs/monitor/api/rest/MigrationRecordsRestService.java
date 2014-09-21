package com.ostdlabs.monitor.api.rest;

import com.ostdlabs.monitor.api.entities.SqlMigrationRecord;
import com.ostdlabs.monitor.api.repositories.SqlMigrationRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aakhmerov
 * Date: 7/20/13
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/migration")
@Component
public class MigrationRecordsRestService {

    @Autowired
    private SqlMigrationRecordRepository sqlMigrationRecordRepository;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/")
    public List<SqlMigrationRecord> getAllTeachers() {

        return (List<SqlMigrationRecord>)sqlMigrationRecordRepository.findAll();
    }

}
