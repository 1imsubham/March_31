t=int(input())
for i in range(t):
	l=input()
	r=input()
	c=1
	d=0
	j=1
	for j in range(l):
		c=c+2
	d=c
	l=l-r
	j=0
	for j in range(l):
		d=d+2
		c=c+d
	print(c)
