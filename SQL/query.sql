SELECT 
    dso.id AS dso_id,
    dso.name AS dso_name,
    dp.practice_id,
    dpi.practice_name,
    dp.id AS doctor_id,
    concat(du.first_name,' ',du.last_name) AS doctor_name,
    du.email AS doctor_email,
    pat.id AS patient_id,
    concat(pat.first_name,' ',pat.last_name) AS patient_name,
    users.email AS patient_email,
    concat(ab.street1,',',ab.street2,',',ab.state,',',ab.zipcode) AS patient_primary_address,
    concat(abd.street1,',',abd.street2,',',abd.state,',',abd.zipcode) AS doctor_address
FROM patients pat
INNER JOIN users
ON pat.user_id = users.id
INNER JOIN address_book ab
ON pat.user_id = ab.user_id AND ab.type = 'PRIMARY'
LEFT JOIN treatments tmt
ON pat.id = tmt.patient_id
LEFT JOIN users du
ON tmt.doctor_user_id = du.id
LEFT JOIN address_book abd
ON tmt.doctor_user_id = abd.user_id
LEFT JOIN doctor_profiles dp
ON tmt.doctor_user_id = dp.doctor_user_id
LEFT JOIN doctor_practice_informations dpi
ON tmt.doctor_practice_information_id = dpi.id
LEFT JOIN dso
ON dpi.dso_id = dso.id;