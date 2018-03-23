print("hello world")
nilaai = 3
nilaai += 2
print(nilaai)
nilaii = 2
print(nilaai//nilaii)
a=c=10
print (a,c)
e,f,g = "ghina",21, 1
print(e,f,g)
#hallo ksalsklakslkslakslakslaklsalsklaslaklsalsklakslkalsk
s=10
s*=12
print(s)
nilai=int(input("masukkan nilai"))
print(nilai)
p=int(input("masukkan nilai"))
r=int(input("masukkan nilai"))
n=int(input("masukkan nilai"))
b=int(input("masukkan nilai"))
print (p*((1+(r/n))**b))
print ((((r/n)+1)**b)*p)
print (p,"*","(","(",1,"+","(",r,"/",n,")",")","**",b)

#looping while
angka=10
while angka>0:
    print ("angka"), angka
    angka= angka-1
    if angka==7:
        break

#looping star
string =""
bar=1
x=int(input("masukkan angka:"))
#looping baris
while bar <=x:
    kol=bar

    #looping kolom
    while kol>0:
        string=string+"*"
        kol=kol-1
    string = string+"\n"
    bar=bar+1
print(string)

# looping star
strings = ""
bars = int(input("masukkan angka:"))
# looping baris
while bars >= 0:
    kols = bars

    # looping kolom
    while kols > 0:
        strings = strings + "*"
        kols = kols - 1
    strings = strings + "\n"
    bars = bars - 1
print(strings)

