#!/usr/bin/env python
# coding: utf-8

# In[1]:


#for loop
"""
range(int stop)
range(int start,int stop)
range(int start,int stop,int step)
"""
for i in range(11):
    print("Number is :",i+1)


# In[2]:


#for loop
"""
range(int stop)
range(int start,int stop)
range(int start,int stop,int step)
"""
for i in range(2,9):
    print("Number is :",i)


# In[3]:


#for loop
"""
range(int stop)
range(int start,int stop)
range(int start,int stop,int step)
"""
for i in range(3,20,2):
    print("Number is :",i)


# In[4]:


#for loop
"""
range(int stop)
range(int start,int stop)
range(int start,int stop,int step)
"""
for i in range(20,3,-2):
    print("Number is :",i)


# In[6]:


#for loop
"""
range(int stop)
range(int start,int stop)
range(int start,int stop,int step)
"""
for i in range(10,3,-1):
    print("Number is :",i)


# In[7]:


#nested for loop
for i in range(1,3):
    for j in range(1,6):
        print(j)
    print()


# In[10]:


#nested for loop
for i in range(1,6):
    for j in range(1,6):
        print(j,end=" ")
    print()


# In[9]:


#nested for loop
for i in range(5):
    for j in range(i+1):
        print(j+1,end=" ")
    print()


# In[12]:


#nested for loop
no = int(input("Enter Any Number:"))
for i in range(no):
    for j in range(i+1):
        print(j+1,end=" ")
    print()


# In[13]:


#nested for loop
for i in range(5):
    val = 65
    for j in range(i+1):
        c1 = chr(val)
        #val = val+1 //comment
        val+=1
        print(c1,end=" ")
    print()


# In[20]:


#factorial
no = int(input("Enter Any Number:"))
fact = 1
for i in range(no):
    fact = fact*(i+1)
print("Factorial is :",fact)


# In[22]:


#multiplication table
no = int(input("Enter Any Number:"))
for i in range(10):
    print(no,"*",i+1,"=",no*(i+1))


# In[23]:


#nested for loop
for i in range(1,6):
    for j in range(1,6):
        if j%2==0:
            print("*",end=" ")
        else:
            print("#",end=" ")
    print()


# In[24]:


for i in range(5):
    for j in range(5,i,-1):
        print(i+1,end=" ")
    print()

