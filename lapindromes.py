print("Enter the number of test cases")
n = int(input())

test=[]
for i in range(1,n+1):
    print("Enter the test case: ")
    a=input()
    test.append(a)

if n >= 1 and n <=100:
    for i in test:
        string= i
        str1 = ""
        str2 = ""
        if len(string) >=2 and len(string) <= 1000:
           if len(string) % 2 ==0:
               str1 = string[0: len(string)//2]
               str2= string[len(string)//2: ]
           else:
                str1 = string[0: len(string)//2]
                str2 = string[len(string)//2 +1: ]

           l1= list(str1)
           l2= list(str2)
           l1.sort()
           l2.sort()

           s1= str(l1)
           s2= str(l2)
           if s1 == s2:
               print("Yes")
           else:
               print("No")
        else:
            print("String Limit Exceeded")

else:
    print("Number of test cases exceeded")


        

         



