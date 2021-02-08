package net.barakiroth.java14barebone;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Builder
public class X_Code {
	@Getter(AccessLevel.PUBLIC)private final String codeName;
	@Getter(AccessLevel.PUBLIC) private final String codeValue;
	@Getter(AccessLevel.PUBLIC)private final String parentCodeName;
}