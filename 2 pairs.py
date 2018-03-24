kartu=["2S","2L","2K","2W","3S","3L","3K","3W","4S","4L","4K","4W",
        "5S", "5L", "5K", "5W","6S","6L","6K","6W","7S","7L","7K","7W",
        "8S", "8L", "8K", "8W","9S","9L","9K","9W","10S","10L","10K","10W",
        "JS", "JL", "JK", "JW","QS","QL","QK","QW","KS","KL","KK","KW","AS","AL","AK","AW"]
x=[]
z=0
for i in range(0,12,4):
    for j in range(i,i+4):
        x.append(kartu[j])
    for k in reversed(range(i+1,i+4)):
        x.remove(kartu[k])
        for l in reversed(range(i,(k))):
            x.remove(kartu[l])
            for m in range (i+4,i+8):
                x.append(kartu[m])
            for n in reversed(range(i+5,i+8)):
                x.remove(kartu[n])
                for o in reversed(range(i+4, (n))):
                    x.remove(kartu[o])
                    for p in range ((o*1),52):
                        if ((x[0][0]!= kartu[p][0]) and (x[2][0]!=kartu[p][0])):
                            x.append(kartu[p])
                            print(x)
                            z+=1
                            x.remove(kartu[p])
                    x.append(kartu[o])
                x.append(kartu[n])
            x.append(kartu[l])
        x.append(kartu[k])
    x.clear()
print("jumlah: ",z)