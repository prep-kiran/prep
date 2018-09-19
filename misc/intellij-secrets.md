Text navigation - 1
----------------------
1. Move the cursor one word at a time
        forward shortcut: alt (option) + right-arrow
        return shortcut: alt (option) + left arrow
2. Move the cursor to the beginning of the line
        shortcut: command + left-arrow
3. Move the cursor to the end of the line
        shortcut: command + right-arrow


Text navigation - 2
----------------------
1. Scroll page up
        shortcut: fn + up-arrow
2. Scroll page down
        shortcut: fn + down-arrow
3. Move the cursor to the end of current file
        shortcut: fn + command + right-arrow
4. Move the cursor to the beginning of current file
        shortcut: fn + command + left-arrow


Editing and Working with code
------------------------------
1. Duplicate current line
        shortcut: command + d
2. Delete current line
        command + delete
3. View suggested parameters of a method
        shortcut: command + p
4. Introduce line comments for each line in a block of code
        forward shortcut: command + /
        return shortcut: command + /
5. Introduce block comments for a block of code
        forward shortcut: command + alt (option) + /
        return shortcut: command + alt (option) + /
4. Expand current code block
        shortcut: command + +
5. Fold current code block
        shortcut: command + -


Code navigation
----------------------
1. Navigate to class
        forward shortcut: command + o
            - type for partial match or
            - type camel humps or
            - type asterisk for a wildcard search
        return shortcut: command + [
2. Navigate to symbol
        forward shortcut: alt (option) + command + o
        return shortcut: command + [
3. Navigate to file
        forward shortcut: shift + command + o
            - type fine name or file path to look up files
            - type folder name with slash in the end to look for folders
4. Navigate to action
        shortcut: shift + command + a
5. Search everywhere
        shortcut: shift + shift
            - tab to shift between sections in search everywhere results window
6. Navigate to recently opened files
        shortcut: command + e
7. Navigate to recently edited files
        shortcut: command + shift + e



Code selection
----------------------
1. Select one character at a time
        shortcut: shift + left-arrow or right-arrow
2. Select one word at a time
        shortcut: shift + alt(option) + left-arrow or right-arrow
3. Select everything from cursor's current position to the beginning or end of line
        shortcut: shift + command + left-arrow or right-arrow
4. Extend current selection
        shortcut: alt (option) + up-arrow
5. Shrink current selection
        shortcut: alt(option) + down-arrow


Code completion
----------------------
1. Smart code completion - 1
        shortcut: shift + ctrl + space
            - after the new keyword in an object declaration
            - in the list of parameters of a method call
            - in return statements
2. Smart code completion - 2
        shortcut: shift + ctrl + space (twice)
            - static expressions
            - collections, lists and arrays
3. Static method completion
        shortcut: ctrl + space (twice)
4. Add a static import
        shortcut: alt(option) + enter
5. Postfix completion
        shortcut: command + j
            - nn/null: checks expression to be null
            - notnull: checks expression to be not null
            - synchronized: produces synchronization statement
            - try: surrounds the statement with try-catch block
            - for: iterates over enumerable collection
            - fori: iterates with index over collection
            - foreach: iterates using the for-each syntax
            - many more options available...


Code generation
----------------------
1. Generate menu in class
        shortcut: command + n
            - generate constructor
            - generate getter
            - generate setter
            - generate getter & setter
            - generate equals method
            - generate hashCode method



Version control
-----------------
1. Commit project to VCS
        shortcut: command + k
2. Show diff of a file in Commit changes dialog
        shortcut: command + d
3. Revert a file in Commit changes dialog
        shortcut: alt(option) + command + z
4. Bring up VCS operations popup
        shortcut: ctrl + v
            - type branch name in the branch list to search for branches
            - select Annotate in VCS operations popup to display annotation panel



Code style
-------------
1. Move the selection one tab stop to the right
        shortcut: tab
2. Move the selection one tab stop to the left
        shortcut: shift + tab
3. Reformat current selection or file
        shortcut: alt(option) + command + l
4. Extend selection
        shortcut: alt(option) + up-arrow
5. Move focus to project tool window
        shortcut: command + 1
6. Optimize import statements
        shortcut: ctrl + alt (option) + o
            - enable optimize imports on the fly to automatically optimize imports after every code change
            - select optimize imports option in Commit changes dialog to optimize imports before checking in code
7. Build the application
        shortcut: command + F9
8. Navigate to compilation errors
        forward shortcut: command + alt (option) + down-arrow or up-arrow
        return shortcut: esc



Language injection
--------------------
1. Add language injection
        shortcut: alt (option) + enter
2. Close current fragment editor or current file
        shortcut: command + w
