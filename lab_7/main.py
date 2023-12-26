def main():
    arrsize = int(input("Input size of array: "))
    filler = input("Input f of array:")

    if not filler:
        print("\nNo placeholder character entered")
        exit(0)
    if len(filler) > 1:
        print("\nToo many placeholder characters")
        exit(0)

    arr = [['' for _ in range(arrsize - k)] for k in range(0, arrsize, 2)]

    tabs = 0
    for i in range(len(arr)):
        for _ in range(tabs):
            print("\t", end="")
        for n in range(len(arr[i])):
            arr[i][n] = filler
            print(arr[i][n] + "\t", end="")
        tabs += 1
        print()

if __name__ == "__main__":
    main()
