# MerchantReportingAPIDemo
Transaction Merchant Reporting API Demo

# Codes
https://github.com/mimaraslan/MerchantReportingAPIDemo

# Video
https://yadi.sk/i/8Tma7FsMaUicag




# STEP 1 #############################
CREATE SCHEMA testdb DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;


# STEP 2 #############################
# RUN JAVA APP MerchantReportingAPIDemo



# STEP 3 #############################
INSERT INTO testdb.roles(name) VALUES('ROLE_USER');
INSERT INTO testdb.roles(name) VALUES('ROLE_PM');
INSERT INTO testdb.roles(name) VALUES('ROLE_ADMIN');

INSERT INTO testdb.responses (`id`,`count`,`currency`,`total`,`txid`) VALUES (1,283,'USD',28300,1);
INSERT INTO testdb.responses (`id`,`count`,`currency`,`total`,`txid`) VALUES (2,280,'EUR',1636515,1);

INSERT INTO testdb.transactions (`txid`,`_from`,`_to`,`acquirer`,`acquirer_id`,`current_page`,`customer_info`,`error_code`,`filter_field`,`filter_value`,`from_date`,`merchant`,`merchant_id`,`next_page_url`,`operation`,`page`,`payment_method`,`per_page`,`prev_page_url`,`status`,`to_date`) VALUES (1,1,2,1,2,2,'3D','Invalid​ ​Card','Customer​ ​Email','xxxx@test.com.tr','2015-07-01 00:00:00',1,1,'https://reporting.rpdpy mnt.com/api/v3/transac tion/list/?page=3','3D',1,'CREDITCARD',50,'https://reporting.rpdpy mnt.com/api/v3/transac tion/list/?page=1','APPROVED','2015-10-01 00:00:00');

INSERT INTO testdb.customer_info (`txid`,`billing_address2`,`billing_addressl`,`billing_city`,`billing_company`,`billing_country`,`billing_fax`,`billing_first_name`,`billing_last_name`,`billing_phone`,`billing_postcode`,`billing_state`,`billing_title`,`birthday`,`created_at`,`deleted_at`,`email`,`expiry_month`,`expiry_year​`,`gender`,`issue_number`,`number`,`shipping_address2`,`shipping_addressl`,`shipping_city`,`shipping_company`,`shipping_country`,`shipping_fax`,`shipping_first_name`,`shipping_last_name`,`shipping_phone`,`shipping_postcode`,`shipping_state`,`shipping_title`,`start_month`,`start_year`,`updated_at`) VALUES (1,NULL,'test​ ​address','Antalya',NULL,'TR',NULL,'Michael','Kara',NULL,'07070',NULL,NULL,'1986-03-20',NULL,NULL,'michael@gmail.com',NULL,'2017',NULL,NULL,NULL,NULL,'test​ ​address','Antalya',NULL,'TR',NULL,'Michael','Kara',NULL,'07070',NULL,NULL,NULL,NULL,'2015-10-09 00:00:00');

INSERT INTO testdb.data (`id`,`transaction`,`acquirer`,`customerlnfo`,`fx`,`ipn`,`merchant`,`refundable`,`txid`) VALUES (1,'received','id,name','email,​ ​billingFirstName','originalAmount, originalCurrency','received','name,​ ​id','1',1);
INSERT INTO testdb.data (`id`,`transaction`,`acquirer`,`customerlnfo`,`fx`,`ipn`,`merchant`,`refundable`,`txid`) VALUES (2,'2','2','2','2','2','2',NULL,NULL);