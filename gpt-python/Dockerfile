FROM python:3.11
RUN apt-get update && apt-get install -y python3-pip
WORKDIR /user/src/myapp
COPY . /user/src/myapp/
RUN pip3 install openai
RUN pip3 install gradio
CMD ["python3", "GPT.py"]