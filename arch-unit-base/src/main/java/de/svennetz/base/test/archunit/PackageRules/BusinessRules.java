package de.svennetz.base.test.archunit.PackageRules;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class BusinessRules {
	@ArchTest
	public static final ArchRule business_should_not_call_services = classes()
    .that().resideInAPackage("..business..")
    .should().accessClassesThat().resideInAPackage("..services..");

}
