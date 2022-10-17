def hello(name:str = "Jack") -> str:
        return(f"Hello {name.title()}")


def main():
        name = str(input("Please enter you name: "))
        print(hello(name))


if __name__ == "__main__":
        main()
