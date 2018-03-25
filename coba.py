# kartu=["2S","2L","2K","2W","3S","3L","3K","3W","4S","4L","4K","4W",
#         "5S", "5L", "5K", "5W","6S","6L","6K","6W","7S","7L","7K","7W",
#         "8S", "8L", "8K", "8W","9S","9L","9K","9W","10S","10L","10K","10W",
#         "JS", "JL", "JK", "JW","QS","QL","QK","QW","KS","KL","KK","KW","AS","AL","AK","AW"]
# x=[]
# z=0
# for i in range(0,12,4):
#     for j in range(i,i+4):
#         x.append(kartu[j])
#     for k in reversed(range(i+1,i+4)):
#         x.remove(kartu[k])
#         for l in reversed(range(i,(k))):
#             x.remove(kartu[l])
#             for m in range (i+4,i+8):
#                 x.append(kartu[m])
#             for n in reversed(range(i+5,i+8)):
#                 x.remove(kartu[n])
#                 for o in reversed(range(i+4, (n))):
#                     x.remove(kartu[o])
#                     for p in range ((o*1),52):
#                         if ((x[0][0]!= kartu[p][0]) and (x[2][0]!=kartu[p][0])):
#                             x.append(kartu[p])
#                             print(x)
#                             z+=1
#                             x.remove(kartu[p])
#                     x.append(kartu[o])
#                 x.append(kartu[n])
#             x.append(kartu[l])
#         x.append(kartu[k])
#     x.clear()
# print("jumlah: ",z)



#Coba 2
# kartu=["2h","2w","2s","2k","3h","3w","3s","3k","4h","4w","4s","4k","5h","5w","5s","5k","6h","6w","6s","6k",
#       "7h","7w","7s","7k","8h","8w","8s","8k","9h","9w","9s","9k","10h","10w","10s","10k",
#       "jh","jw","js","jk","qh","qw","qs","qk","kh","kw","ks","kk","ah","aw","as","ak"]
# x=[]
# z=0
# for i in range(0,48,4):
#     for j in reversed(range(i+1,i+4)):
#         x.append(kartu[j])
#         for k in reversed(range(i,j)):
#             if ((x[0][1]!=kartu[k][1])):
#                 x.append(kartu[k])
#                 for l in range(i,48,4):
#                     for m in reversed(range(l+5,l+8)):
#                         if(x[0][0]!=kartu[m][0]):
#                             x.append(kartu[m])
#                             for n in reversed(range(l+4,m)):
#                                 if(x[2][1]!=kartu[n][1]):
#                                     x.append(kartu[n])
#                                     for o in range(52):
#                                         if(x[0][0]!=kartu[o][0]) and (x[2][0]!=kartu[o][0]):
#                                             x.append(kartu[o])
#                                             print(x)
#                                             x.remove(kartu[o])
#                                             z+=1
#                                     x.remove(kartu[n])
#                             x.remove(kartu[m])
#                 x.remove(kartu[k])
#         x.remove(kartu[j])
#     x.clear()
# print("jumlah kombinasi:",z)



#coba 3
kartu=["2h","2w","2s","2k","3h","3w","3s","3k","4h","4w","4s","4k","5h","5w","5s","5k","6h","6w","6s","6k",
      "7h","7w","7s","7k","8h","8w","8s","8k","9h","9w","9s","9k","10h","10w","10s","10k",
      "jh","jw","js","jk","qh","qw","qs","qk","kh","kw","ks","kk","ah","aw","as","ak"]
penampung = []
z=0
for e in range(0,len(kartu)):
    for f in range(0, len(kartu)):
        for g in range(0, len(kartu)):
            for h in range(0, len(kartu)):
                for i in range(0,len(kartu)):
                    if(len(penampung) == 0 ):
                        penampung.append(kartu[e])
                    if (len(penampung) == 1):
                        if (penampung[0][:1] == kartu[f][:1]):
                            if (penampung[0] != kartu[f]):
                                penampung.append(kartu[f])
                    if (len(penampung) == 2):
                        if(penampung[0][:1] != kartu[g][:1] and penampung[1][:1] != kartu[g][:1]):
                            penampung.append(kartu[g])
                    if (len(penampung) == 3):
                        if (penampung[2][:1] == kartu[h][:1]):
                            if (penampung[2] != kartu[h]):
                                penampung.append(kartu[h])
                    if (len(penampung) == 4):
                        if(penampung[0][:1] != kartu[i][:1] and penampung[1][:1] != kartu[i][:1] and penampung[2][:1] != kartu[i][:1] and penampung[3][:1] != kartu[i][:1]):
                            penampung.append(kartu[i])
                    if(len(penampung) == 5):
                        # print(penampung)
                        z=z+1
                        penampung.clear()
print(z)