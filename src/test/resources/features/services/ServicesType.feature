Feature: Services

#  Background: login
#    Given I send a POST request to /projects
#      | name            | AT01 project-01 |
#    And I expect the status code 200
#    Given I request to Pivotal Tracker
#      | description | AT01 project-01 |
#      | token       | 1               |

#    Given I request to Jala Agile Tracker
#      | description    | AT01 project-01 |
#      | Server Address | 1               |
#      | token          | Monday          |

#    Given I request to Team Foundation Server
#      | description | AT01 project-01 |
#      | version     | 1               |
#      | username    | Monday          |
#      | password    | AT01 project-01 |
#      | apiBaseUrl  | 1               |
#
#
#    Given I request to Version One
#      | description | AT01 project-01 |
#      | apiBaseUrl  | 1               |
#      | token       | Monday          |
#
#    Given I request to MySQL DB
#      | description | AT01 project-01 |
#      | host        | 1               |
#      | port        | Monday          |
#      | user        | Monday          |
#      | password    | AT01 project-01 |
#      | dataBase    | 1               |
#
#    Given I request to PASSe Azul
#      | description    | AT01 project-01 |
#      | Server Address | 1               |
#      | Report Addres  | Monday          |
#      | user           | Monday          |
#      | password       | AT01 project-01 |
#
#    Given I request to Open ERP
#      | description    | AT01 project-01 |
#      | Server Address | 1               |
#      | Database       | Monday          |
#      | user           | Monday          |
#      | password       | AT01 project-01 |
#
#    Given I request to Bonita Soft
#      | description    | AT01 project-01 |
#      | Server Address | 1               |
#      | Server diagram | Monday          |
#      | user           | Monday          |
#      | password       | AT01 project-01 |
#
#    And I expect the status code 200
#    And Synchronize Mach2 and Pivotal
  @Login
  Scenario: Add anyone services
    When I add a service
      | SERVICENAME  | Pivotal Tracker |
      | TOKEN        | 6d7559555b6bded8c69c35db1746cabe |
      | DESCRIPTION  | Juanilla       |
    And I add a service
      | SERVICENAME  | Pivotal Tracker |
      | TOKEN        | 6d7559555b6bded8c69c35db1746cabe2 |
      | DESCRIPTION  | Juanillas      |
    And I add a service
      | SERVICENAME    | Jala Agile Tracker |
      | DESCRIPTION    | juancilla |
      | SERVERADDRESS  | 1               |
      | TOKEN          | 6d7559555b6bded|
