// def call(String project, String ImageTag, String hubUser){
//     sh """
//       trivy image ${hubUser}/${project}:latest > scan.txt
//       cat scan.txt 
//       """
// }

def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
    if [ -e scan* ]; then
        rm scan*
    fi
    trivy image ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest > scan-${BUILD_NUMBER}.txt
    cat scan-${BUILD_NUMBER}.txt
    """
}
/*
#!/bin/bash

# Set the absolute path to scan.txt
scan_file="/var/lib/jenkins/workspace/Project_3/scan.txt"

# Check if scan.txt exists
if [ ! -f "$scan_file" ]; then
  echo "Error: $scan_file not found."
  exit 1
fi

# Variables to store the image name and vulnerability counts
image_name=""
vulnerability_info=""

# Read scan.txt and process the results
while IFS= read -r line; do
  # Check if the line contains "Target:"
  if [[ "$line" == "Target:"* ]]; then
    image_name=$(echo "$line" | cut d ':' -f2 | tr -d '[:space:]')
  fi

  # Check if the line contains vulnerability counts
  if [[ "$line" == "Total:"* ]]; then
    vulnerability_info="$line"
    break
  fi
done < "$scan_file"

# Display the output
echo "$image_name"
echo "====================================="
echo "$vulnerability_info"
*/