package org.safina.safinabackend.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter
import org.safina.safinabackend.entity.*

@Configuration
class RepositoryConfig : RepositoryRestConfigurerAdapter() {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
        config.exposeIdsFor(Membre::class.java)
        config.exposeIdsFor(Photo::class.java)
        config.exposeIdsFor(TbCommande::class.java)

        // config.exposeIdsFor(
        //     entityManager.getMetamodel().getEntities().stream()
        //     .map(Type::getJavaType)
        //     .toArray(Class[]::new));
    }
}