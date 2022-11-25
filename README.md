# SoftwareEngineeringLab-E4

## سید مهدی فقیه 97106198
## محمدرضا یوسف پور 97106324
## درصد مشارکت هر دو عضو تیم در انجام آزمایش یکسان بوده است

### شرح آزمایش : 

در ابتدا برای شروع TDD  ما یک کلاس Test ساختیم که در آن از کلاس فرضی مستطیل یک نمونه ساختین و تابع فرضی computeArea را با دو مقدار متفاوت برای طول و عرض تست کردیم که در ابتدا به دلیل وجود نداشتن کلاس مستطیل تست ها fail شدند و به compile error  هم برخوردیم

![image](https://user-images.githubusercontent.com/45511559/203950052-62ff5f97-4632-4ab5-ad64-f3ffc1c477dc.png)

![image](https://user-images.githubusercontent.com/45511559/203950595-1baec101-3c95-46a3-b078-ebab35af59c2.png)

 همانظور که در عکس بالا مشاهده می کنید ما به مشکل کامپایل برخوردیم که پس از اضافه کردن کلاس مستطیل این مشکل برطرف شد

![image](https://user-images.githubusercontent.com/45511559/203950944-6dc70dea-b62b-4542-b252-a7013d50c669.png)

![image](https://user-images.githubusercontent.com/45511559/203951102-7efd934e-a3ac-42f9-ac9c-262da5be9034.png)

در عکس بالا واضح است که پس از افزودن کلاس مستطیل این تست ها پاس شدند.


ولی در گام چهارم گفته شده بود که در برنامه اشکال زمان اجرا داشته باشیم که بنابر این در ابتدا تابع computeArea به جای ضرب طول و عرض آن ها را جمع می کند و تست های مدنظر ما fail  می شود.

![image](https://user-images.githubusercontent.com/45511559/203954656-a870c994-bd76-401f-bd0b-ef1404bbda8f.png)

![image](https://user-images.githubusercontent.com/45511559/203954766-43745ea9-bafd-4364-a407-f49cdf0ac529.png)

![image](https://user-images.githubusercontent.com/45511559/203954783-0aa7aaf6-55b6-4061-8a76-95df7c94d60d.png)




در قسمت دوم آزمایش توابع set , get  را برای دو متغیر طول و عرض افزودیم و در فایل تست از این دو تابع استفاده کردیم تا بتوانیم بعد از ایجاد یک instance  از کلاس مجددا مقادیر طول و عرض را تغییر دهیم.

![image](https://user-images.githubusercontent.com/45511559/203952111-fa956c3f-e1a5-45be-8eab-13550a237ae6.png)

![image](https://user-images.githubusercontent.com/45511559/203952415-74a94158-b664-45fb-ac3e-5e57b68e9353.png)

![image](https://user-images.githubusercontent.com/45511559/203952612-e3194589-f507-4623-96b5-e27c16302c98.png)

در بخش سوم کلاس مربع را نیز اضافه کردیم که از مستطیل ارث بری می کند.constructor  آن یک متغیر طول میگیرد و مستطیلی که ول و عرض آن برابر با همان متغیر باشد را میسازد همچنین توابع setHeight  و setWidth دراین کلاس override  شدند که هم طول و هم عرض مستطیل تغییر یابد

![image](https://user-images.githubusercontent.com/45511559/203953692-db8ef771-b0c6-42a7-b115-8514d56d4737.png)

![image](https://user-images.githubusercontent.com/45511559/203953767-e45d005f-4207-441a-918d-cc6bebf2ccd3.png)

![image](https://user-images.githubusercontent.com/45511559/203953826-5007da34-8ffd-4a3a-9d01-11177906f4c6.png)

![image](https://user-images.githubusercontent.com/45511559/203953866-f221fdd8-ff70-45aa-8960-d0a7fd7573a1.png)



