package infra.module

import com.datastax.driver.core.Cluster
import com.google.inject.AbstractModule
import com.google.inject.Provides

/**
 * Cassandra Connection module
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 *
 */
class CassandraModule:AbstractModule() {

    override fun configure() {}

    @Provides
    fun connection():Cluster = Cluster.builder().addContactPoint("127.0.0.1").withPort(9042).build()

}