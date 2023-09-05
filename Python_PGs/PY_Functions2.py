#!/usr/bin/env python
# coding: utf-8

# In[5]:


#Default Arguments
def s1(x,y=100):
    print("Value Of X = ",x)
    print("Value Of Y = ",y)
s1(10,20)


# In[13]:


#Keyword Arguments 1
def a1(*nm):
    print("Name =",nm[0],nm[1],nm[2])
    print("Name =",nm[2],nm[1],nm[1])# We can set index as per requirement
    print("Name =",nm[0],nm[2],nm[1])
a1('A','B','C')


# In[27]:


#Positional & Keyword Arguments 2
def details(id1,name,sal):
    print("Emp Id =",id1)
    print("Emp Name =",name)
    print("Emp Name =",sal)
details(101,name='Abc',sal=12000)


# In[30]:


#Pass By Value
#In Pass by Value The Original Value of Variable does not change..
def a1(int):
    int += 100
    print("Inside Function Call = ",int)
int = 100
print("Before Function Call = ",int)
a1(int)
print("After Function Call = ",int)


# In[32]:


# Pass By Reference
#In Pass by Reference The Original Value of Variable getting change..
def a1(a):
    a.append('100')
    print("Inside Function = ",a)
a=[10] 
print("Before Function Call = ",a)
a1(a)
print("After Function Call = ",a)


# In[ ]:




