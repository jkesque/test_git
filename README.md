# This is the first step

- Add some stuff here

## Using reverse.py

The reverse.py script takes in whatever string you want to reverse, and outputs the characters in reverse order.

**Requirements:** Python 3.9 or higher must be installed. (Earlier versions may or may not work)

Use the following command to run the script in prompt mode

```bash
python reverse.py
```
Type whatever you want to be reversed, and it will reverse it upon hitting "enter"

Alternatively, you can feed them in through the pipe as follows

```bash
echo "test line" | python reverse.py
```

This will just return the reversed string, pipeable into other functions. Note that piping into reverse.py twice will return the original line

