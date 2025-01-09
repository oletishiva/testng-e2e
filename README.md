# testng-e2e
Demonstrate testng features <br>

Steps:
-------- 

### Step 1 
Install git --> git --version <br>
mkdir <dirname> --> mkdir testng-e2d <br>
cd to dirname <br>
git init <br>


### Step 2

Log in to GitHub.<br>
Click the New Repository button. <br>
Fill in repository details (name, description, public/private). <br>
Click Create Repository. <br>
Copy the repository's remote URL (e.g., https://github.com/username/my-project.git).<br>

### step 3
Connect Local Repository to GitHub <br>
If you created a local repository, connect it to the remote GitHub repository: <br>
git remote add origin https://github.com/username/my-project.git <br>
Verify the connection: <br>
git remote -v <br>


### STEP 4
#### Set Up a Slack Incoming Webhook
Go to Slack Apps:

Visit the Slack API page for creating webhooks.
Create an App:

Click Create New App.
Select From Scratch.
Name your app (e.g., "CircleCI Notifications") and choose your Slack workspace.
Enable Webhooks:

Under Features, go to Incoming Webhooks.
Turn on Activate Incoming Webhooks.
Add a Webhook to a Channel:

Click Add New Webhook to Workspace.
Select the channel where you want to receive notifications (e.g., #ci-notifications).
Click Allow.
Copy the Webhook URL (e.g., https://hooks.slack.com/services/XXXX/YYYY/ZZZZ).
