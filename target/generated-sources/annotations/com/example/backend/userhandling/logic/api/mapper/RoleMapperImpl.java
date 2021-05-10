package com.example.backend.userhandling.logic.api.mapper;

import com.example.backend.userhandling.dataaccess.api.entity.RoleEntity;
import com.example.backend.userhandling.logic.api.to.RoleEto;
import com.example.backend.userhandling.logic.api.to.RoleTo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-10T20:52:10+0200",
    comments = "version: 1.4.0.Final, compiler: javac, environment: Java 14.0.2 (BellSoft)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleEntity toRoleEntity(RoleTo roleTo) {
        if ( roleTo == null ) {
            return null;
        }

        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setName( roleTo.getName() );
        roleEntity.setDescription( roleTo.getDescription() );

        return roleEntity;
    }

    @Override
    public RoleEto toRoleEto(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleEto roleEto = new RoleEto();

        roleEto.setId( roleEntity.getId() );
        roleEto.setName( roleEntity.getName() );
        roleEto.setDescription( roleEntity.getDescription() );

        return roleEto;
    }
}
