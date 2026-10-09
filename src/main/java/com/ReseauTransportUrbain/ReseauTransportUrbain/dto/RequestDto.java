package com.ReseauTransportUrbain.ReseauTransportUrbain.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(ArretRequestDto.class),
        @JsonSubTypes.Type(BusRequestDto.class),
        @JsonSubTypes.Type(ConducteurRequestDto.class),
        @JsonSubTypes.Type(CourseRequestDto.class),
        @JsonSubTypes.Type(LigneRequestDto.class)

})
public interface RequestDto { }
