#author Dylan

  @stories
  Feature: manage medical appointment
    as a patient i want to make a request of a medical appointment
    through the hospital administration system

    Background:
      Given the user enters in the hospital administration system

    @scenario1
    Scenario Outline: add a new doctor
      Given Dylan needs <menu>
      When he add the doctor in the hospital administration system
        | fullName   | lastName   | telephone   | identificationType   | doctorIdentificationId   |
        | <fullName> | <lastName> | <telephone> | <identificationType> | <doctorIdentificationId> |
      Then he looks in the screen for the message of <successResult>

      Examples:
        | fullName | lastName | telephone | identificationType | doctorIdentificationId | successResult                 | menu      |
        | Julian   | Pardo    | 12345678  | Pasaportes         | 543                    | Datos guardados correctamente.| addDoctor |

    @scenario2
    Scenario Outline: add a new patient
      Given Dylan needs <menu>
      When he add the patient in the hospital administration system
        | fullName   | lastName   | telephone   | identificationType   | patientIdentificationId   |
        | <fullName> | <lastName> | <telephone> | <identificationType> | <patientIdentificationId> |
      Then he looks in the screen for the message of <successResult>

      Examples:
        | fullName | lastName | telephone | identificationType | patientIdentificationId | successResult                 | menu       |
        | Julian   | Pardo    | 12345678  | Pasaportes          | 345                    | Datos guardados correctamente.| addPatient |

    @scenario3
    Scenario Outline: schedule a new appointment
      Given Dylan needs <menu>
      When he make the appointment scheduling in the hospital administration system
        | observation   | patientIdentificationId   | doctorIdentificationId   |
        | <observation> | <patientIdentificationId> | <doctorIdentificationId> |
      Then he looks in the screen for the message of <successResult>


      Examples:
        | observation | patientIdentificationId | doctorIdentificationId | successResult                 | menu               |
        | urgent      | 345                     | 543                    | Datos guardados correctamente.| sheduleAppointment |





