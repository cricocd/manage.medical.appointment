#author Dylan

  @stories
  Feature: manage medical appointment
    as a patient i want to make a request of a medical appointment
    through the hospital administration system

    Background:
      Given the user have an account active
      And the user enters in the hospital administration system

    @scenario1
    Scenario Outline: add a new doctor
      Given Dylan needs adds a new doctor
      When he add the doctor in the hospital administration system
        | fullName   | lastName   | telephone   | identificationType   | doctorIdentificationId   |
        | <fullName> | <lastName> | <telephone> | <identificationType> | <doctorIdentificationId> |
      Then he looks in the screen for the message of <successResult>

      Examples:
        | fullName | lastName | telephone | identificationType | doctorIdentificationId | successResult                 |
        | Julian   | Pardo    | 12345678  | Pasaportes         | 876                    | Datos guardados correctamente.|

    @scenario2
    Scenario Outline: add a new patient
      Given Dylan needs adds a new patient
      When he add the patient in the hospital administration system
        | fullName   | lastName   | telephone   | identificationType   | patientIdentificationId   |
        | <fullName> | <lastName> | <telephone> | <identificationType> | <patientIdentificationId> |
      Then he looks in the screen for the message of <successResult>

      Examples:
        | fullName | lastName | telephone | identificationType | patientIdentificationId | successResult                  |
        | Julian   | Pardo    | 12345678  | Pasaportes          | 678                    | Datos guardados correctamente.|

    @scenario3
    Scenario Outline: schedule a new appointment
      Given Dylan needs go to the doctor
      When he make the appointment scheduling in the hospital administration system
        | observation   | patientIdentificationId   | doctorIdentificationId   |
        | <observation> | <patientIdentificationId> | <doctorIdentificationId> |
      Then he looks in the screen for the message of <successResult>


      Examples:
        | observation | patientIdentificationId | doctorIdentificationId | successResult                 |
        | urgent      | 678                     | 876                    | Datos guardados correctamente.|





