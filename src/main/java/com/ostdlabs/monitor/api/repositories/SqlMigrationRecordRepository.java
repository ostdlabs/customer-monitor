package com.ostdlabs.monitor.api.repositories;


import com.ostdlabs.monitor.api.entities.SqlMigrationRecord;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * User: GSmirnoff
 * Date: 18.02.14
 * Time: 13:56
 * To change this template use File | Settings | File Templates.
 */
public interface SqlMigrationRecordRepository extends CrudRepository<SqlMigrationRecord, Long> {
}
