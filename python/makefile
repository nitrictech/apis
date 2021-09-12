install:
	@echo Installing Project Dependencies
	@pip3 install -e .[dev]

OUTPUT="."
CONTRACTS="../contracts"

grpc-client: install
	@echo Generating Proto Sources
	@echo $(OUTPUT)
	@mkdir -p $(OUTPUT)
	@python3 -m grpc_tools.protoc -I $(CONTRACTS) --python_betterproto_out=$(OUTPUT) ../contracts/*/*/*/*.proto


build: grpc-client
	@echo Building sdist and wheel
	@python3 setup.py sdist bdist_wheel

distribute: build
	@echo Uploading to pypi
	@python3 -m twine upload --repository pypi dist/*

distribute-test: build
	@echo Uploading to testpypi
	@python3 -m twine upload --repository testpypi dist/*