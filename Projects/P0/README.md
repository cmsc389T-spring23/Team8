# Project 0

**Due:** 02/01/22 11:59pm

## 1.  Join The Organization

Fill out [this form](https://docs.google.com/forms/d/e/1FAIpQLSdu2Tv_uU_AkZH9wPpXndMzIRE8Mm99b8hejNoZEU936HlSfQ/viewform) with your name and GitHub username. <br>
## 2.  Join The Slack

We will be using Slack for all forms of communication in this class.
Join the slack with [this link](https://join.slack.com/t/cmsc389t-spring23/shared_invite/zt-1nobh36mb-LJziY0DiaS9Z1uH~vmNQIQ).

## 3.  Team Formation

Sign up for a team on ELMS under the People's Tab. For more details, see the ELMS Assignment.
Your assigned project manager will add you to your team's slack channel and invite you to collaborate on your team's repo. 
_Teams can be no more that 4 people._

## 4.  Set Up Your Local Git Environment


Take the following steps to set up your Local Git Environment

1. Generate your ssh-keys with `ssh-keygen`
2. Configure your local environment with your name and email
   - `git config --global user.name "your_name_here"`
   - `git config --global user.email your_email_here`
3. Add your ssh-keys to your GitHub account
4. Clone our setup repository using ssh `git clone git@github.com:cmsc389T-spring23/git-java-setup.git`

**You CANNOT do the below steps until you have submitted the survey, added to the organization and _accepted_ the invitation that would be sent to the email you used to sign up for Github**

Once you have cloned the remote repository, checkout the setup branch

```bash
cd {path_to_repo}
git checkout setup
git pull
```

Edit the main README and add your name as one of the lines. Then add, commit, and push your changes:

```bash
git add README.md
git commit -m "{your_name} git setup"
git push -u origin setup
```

If you have a merge conflict, you can delete the annotations that have been created by git (starts with `<<<`
or ends with `>>>`) and push your changes:

```bash
git add README.md
git commit -m "{your_name} fix merge conflict"
git push -u origin setup"
```

## 5.  Checking Your Java Installation

To check your java installation, compile and run the HelloWorld class in the repository:

```bash
javac HelloWorld.java
java HelloWorld
```
**Below are the instructions for JUnit Tests. The Output of these Tests will be what you submit on ELMS.**

We will also be using JUnit Tests in this class. Run the following commands to test that you can run and compile JUnit tests:

```bash
javac -cp "junit-4.10.jar:." TestHelloWorld.java 
java -cp "junit-4.10.jar:." org.junit.runner.JUnitCore TestHelloWorld
```

If you are on a Windows Machine, you may need to adjust the syntax:

```bash
javac -cp "junit-4.10.jar;." TestHelloWorld.java 
java -cp "junit-4.10.jar;." org.junit.runner.JUnitCore TestHelloWorld
```

## Academic Integrity

Please **carefully read** the academic honesty section of the course syllabus. **Any evidence** of impermissible cooperation on projects, use of disallowed materials or resources, or unauthorized use of computer accounts, **will be** submitted to the Student Honor Council, which could result in an XF for the course, or suspension or expulsion from the University. Be sure you understand what you are and what you are not permitted to do in regards to academic integrity when it comes to project assignments. These policies apply to all students, and the Student Honor Council does not consider lack of knowledge of the policies to be a defense for violating them. Full information is found in the course syllabus, which you should review before starting.
