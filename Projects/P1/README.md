# Project 1

Due: 02/08, 11:59pm EST (Late 02/10, 02/15)

This project can be completed in-class on 02/01. It is a simple exercise 
to get you familiar with using git on the command line, creating a local 
repo, and pushing that repo to GitHub.

## Create A Local Repo

On your command line,

1. Create a directory for your repository, cd into it, and initialize it

```bash
mkdir MyFirstRepo
cd MyFirstRepo
git init
```

2. Create an empty file in your local workspace

```bash
touch test.txt
```

3. Add "Hello World" to your file

```bash
echo "Hello World" >> test.txt
```

4. \[Optional\] Verify that you have one untracked file

```bash
git status
```

5. Add your file to the **staging area**

```bash
git add test.txt
```

6. \[Optional\] Verify that you your file is in the staging area

```bash
git status
```

7. Commit your file to your **local repository**

```bash
git commit -m "Adding my first file"
```

8. Rename your branch to "main"

```
git branch -M main
```

9. \[Optional\] Verify that your commit shows up in your log

```bash
git log
```

## Create A Remote Repository

On GitHub,

1. Hit the green new button on the left sidebar
2. Give your repository a name, set permissions to public, and leave all other options to default
3. Click ssh on the blue quick setup box and copy the endpoint (git@...MyFirstRepo.git)

## Push Your Local Repository to GitHub

1. Add the **remote** endpoint that you copied from GitHub

```bash
cd MyFirstRepo
git remote add origin {the_remote_you_copied}
```

2. Push your local repository to GitHub

```
git push -u origin main
```

## Submission

Submit a `submission.txt` file to Gradescope. It should be formatted as follows:

```
github_username
repo_name
```

For example,

```
sagars729
MyFirstRepo
```

## Academic Integrity

Please **carefully read** the academic honesty section of the course syllabus. **Any evidence** of impermissible cooperation on projects, use of disallowed materials or resources, or unauthorized use of computer accounts, **will be** submitted to the Student Honor Council, which could result in an XF for the course, or suspension or expulsion from the University. Be sure you understand what you are and what you are not permitted to do in regards to academic integrity when it comes to project assignments. These policies apply to all students, and the Student Honor Council does not consider a lack of knowledge of the policies to be a defense for violating them. Full information is found in the course syllabus, which you should review before starting.
