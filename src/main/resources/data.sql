INSERT INTO DRONE_STATE (IS_ACTIVE,DRONE_STATE) VALUES (true,'IDLE'),(true,'LOADING'),(true,'LOADED'),(true,'DELIVERING'),(true,'DELIVERED'),(true,'RETURNING');
INSERT INTO DRONE_MODEL (IS_ACTIVE,PAYLOAD,MODEL_NAME) VALUES (true,100,'Lightweight' ),(true,200,'Middleweight' ),(true,350,'Cruiserweight' ),(true,500,'Heavyweight' );


INSERT INTO DRONE (BATTERY_CAPACITY ,IS_ACTIVE ,DRONE_MODEL_ID ,DRONE_STATE_ID,SERIAL_NUMBER  )
VALUES
(ROUND(RAND() * 99 + 1),true,1,1,'msd_001'),
(ROUND(RAND() * 99 + 1),true,2,1,'msd_002'),
(ROUND(RAND() * 99 + 1),true,3,1,'msd_003'),
(ROUND(RAND() * 99 + 1),true,4,1,'msd_004'),
(ROUND(RAND() * 99 + 1),true,1,1,'msd_005'),
(ROUND(RAND() * 99 + 1),true,2,1,'msd_006'),
(ROUND(RAND() * 99 + 1),true,3,1,'msd_007'),
(ROUND(RAND() * 99 + 1),true,4,1,'msd_008'),
(ROUND(RAND() * 99 + 1),true,4,1,'msd_009'),
(ROUND(RAND() * 99 + 1),true,3,1,'msd_0010');

INSERT INTO MEDICATION (WEIGHT,IMAGE,CODE,NAME)
VALUES
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0001','Atorvastatin'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0002','Levothyroxine'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0003','Metformin'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0004','Lisinopril'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0005','Amlodipine'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0006','Metoprolol'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0007','Albuterol'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0008','Omeprazole'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0009','Losartan'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0010','Gabapentin'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0011','Hydrochlorothiazide'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0012','Sertraline'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0013','Simvastatin'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0014','Montelukast'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0015','Escitalopram'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0016','Acetaminophen'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0017','Rosuvastatin'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0018','Bupropion'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0019','Furosemide'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0020','Pantoprazole'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0021','Trazodone'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0022','Dextroamphetamine'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0023','Amphetamine Aspartate'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0024','Fluticasone'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0025','Tamsulosin'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0026','Fluoxetine'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0027','Carvedilol'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0028','Duloxetine'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0029','Meloxicam'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0030','Clopidogrel'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0031','Prednisone'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0032','Citalopram'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0033','Insulin Glargine'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0034','Potassium Chloride'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0035','Pravastatin'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0036','Tramadol'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0036','Aspirin'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0038','Alprazolam'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0039','Ibuprofen'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0040','Cyclobenzaprine'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0041','Amoxicillin'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0042','Methylphenidate'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0043','Allopurinol'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0044','Venlafaxine'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0045','Clonazepam'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0046','Ethinyl Estradiol'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0047','Ergocalciferol'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0048','Zolpidem'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0049','Apixaban'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0050','Glipizide'),
(ROUND(RAND() * 499 + 1),'https://picsum.photos/200/300','MED_0000','Hydrochlorothiazide');