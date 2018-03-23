def prime(bil):
    count=0

    for i in range(1,bil+1):
        if(bil%i==0):
            count+=1
    if(count==2):
        return"prime"
    else:
        return"false"
    # if(bil>1):
            # print("bukan")
            # else:
            #     print("prima")

    # if(bil%2!=0):
    #     print("Ini adalah %i Bilangan Prima" %bil)
    # else:
    #     print("bukan bilangan prima")

tes=prime(2)
print(tes)