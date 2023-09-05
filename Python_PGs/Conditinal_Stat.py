#!/usr/bin/env python
# coding: utf-8

# In[4]:


#simple if
no = int(input("Enter Any Number:"))
if no == 10:
    print("Number is 10")


# In[8]:


#if...else
no = int(input("Enter Any Number:"))
if no == 10:
    print("Number is 10")
else:
    print("Number is Not 10")


# In[9]:


#if...else
no = int(input("Enter Any Number:"))
if no % 2 == 0:
    print("Number is Even")
else:
    print("Number is Odd")


# In[12]:


#if...else
no = int(input("Enter Any Number:"))
if no > 0:
    print("Number is Positive")
else:
    print("Number is Negative")


# In[14]:


#ladder if...else
no1 = int(input("Enter Value of No1:"))
no2 = int(input("Enter Value of No2:"))
ch = int(input("Enter Your Choice:"))
if ch==1:
    print("Sum of Two Number is:",no1+no2)
elif ch==2:
    print("Subtraction of Two Number is:",no1-no2)
elif ch==3:
    print("Multiplication of Two Number is:",no1*no2)
elif ch==4:
    print("Division of Two Number is:",no1-no2)
else:
    print("Plz Input 1 To 4")


# In[20]:


#Ladder if..else
no = int(input("Enter Any Number:"))
if no==0:
    print("Number is Zero")
elif no > 0:
    print("Number is Positive")
else:
    print("Number is Negetive")


# In[23]:


#Ladder if..else
sub1 = int(input("Enter Subject 1 : "))
sub2 = int(input("Enter Subject 2 : "))
sub3 = int(input("Enter Subject 3 : "))
sub4 = int(input("Enter Subject 4 : "))
sub5 = int(input("Enter Subject 5 : "))
tot = sub1+sub2+sub3+sub4+sub5
per = tot/5
print("Total is :",tot)
print("Percentage is :",per)
if per>70:
    print("Distition")
elif per>60:
    print("1st Class")
elif per>50:
    print("2nd Class")
elif per>40:
    print("Pass")
else:
    print("Fail")


# In[35]:


#ladder if...else
no1 = int(input("Enter Value of No1:"))
no2 = int(input("Enter Value of No2:"))
no3 = int(input("Enter Value of No3:"))
if no1>no2 and no1>no3:
    print("No1 is Max")
elif no2>no3 and no2>no1:
    print("No2 is Max")
elif no3>no1 and no3>no2:
    print("No3 is Max")
else:
    print("More than One Numbers are Max")


# In[36]:


#zero,positive, negetive//nested if..else
no = int(input("Enter Any Number:"))
if(no==0):
    print("Number is Zero")
else:
    if(no>0):
        print("Number is Positive")
    else:
        print("Number is Negetive")


# In[43]:


#nested if..else
no1 = int(input("Enter Value of No1:"))
no2 = int(input("Enter Value of No2:"))
no3 = int(input("Enter Value of No3:"))
if no1>no2:
    if no1>no3:
        print("No1 is Max")
    else:
         print("No3 is Max")
else:
    if no2>no3:
        print("No2 is Max")
    else:
         print("No3 is Max")


# In[ ]:




