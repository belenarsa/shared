#!/usr/bin/env groovy
def call(String name = 'human') {
	echo "${currentBuild.number}: ¡${org.acme.GlovalVars.salutation} ${name} desde el primer paso de ${BRANCH_NAME}!"
