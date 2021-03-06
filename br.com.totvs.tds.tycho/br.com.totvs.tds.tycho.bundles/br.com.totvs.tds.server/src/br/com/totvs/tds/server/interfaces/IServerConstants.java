package br.com.totvs.tds.server.interfaces;

/**
 * Constantes para uso geral.
 *
 * @author eriky.kashivagui
 *
 */
public interface IServerConstants {

	static final String ENVIRONMENT = "environment"; //$NON-NLS-1$
	static final String LAST_ENVIRONMENTS = "lastEnvironments"; //$NON-NLS-1$ environmentsAllowed
	static final String PASSWORD = "password"; //$NON-NLS-1$
	static final String TOKEN = "token"; //$NON-NLS-1$
	static final String USE_SECURE_STORAGE = "useSecureStorage"; //$NON-NLS-1$
	static final String USERNAME = "username"; //$NON-NLS-1$
	static final String PERMISSIONS = "permissions"; //$NON-NLS-1$
	static final String SERVER_ADDRESS = "serverAddress"; //$NON-NLS-1$
	static final String SECURE_CONNECTION = "secure.connection";//$NON-NLS-1$

	/**
	 * Limpa o repositório.
	 */
	static final String _CLEAN_REPOSITORY = "server.clean.repository"; //$NON-NLS-1$

	/**
	 * Gerar arquivos PPO durante a compilação.
	 */
	static final String GENERATE_PPO_FILE_SERVER = "server.generate.ppo"; //$NON-NLS-1$

	/**
	 * O id da página de configuração do servidor nas prefer�ncias do sistema.
	 */
	static final String __ID_SERVER_CONFIG_PREFERENCE = "br.com.totvs.tds.server.ui.configuracao"; //$NON-NLS-1$

	static final String __ID_SMARTCLIENT_PREFERENCEPAGE = "br.com.totvs.tds.server.ui.preference.smartClient"; //$NON-NLS-1$

	/**
	 * Inclui informações para depuração
	 */
	static final String INCLUDE_DEBUG_INFORAMATION = "server.include.debug.information"; //$NON-NLS-1$

	/**
	 * Abre as informações do servidor ao conectar.
	 */
	static final String OPEN_SERVER_INFORMATION = "server.open.information"; //$NON-NLS-1$

	/**
	 * Reconecta no servidor automaticamente.
	 */
	static final String PULSE_SERVER = "server.pulse.server"; //$NON-NLS-1$

	/**
	 * Politica de reconexão de servidores. <br />
	 * <b>Todos os servidores serão reconectados automaticamente ao abrir o TDS.</b>
	 */
	static final String RECONNECT_ALL_SERVERS = "2"; //$NON-NLS-1$

	/**
	 * Politica de reconexão de servidores. <br />
	 * <b>Nenhum servidor ser� reconectado automaticamente ao abrir o TDS.</b>
	 */
	static final String RECONNECT_NONE_SERVER = "0"; //$NON-NLS-1$

	/**
	 * Politica de reconexão de servidores. <br />
	 * <b>Apenas servidores selecionados serão reconectados automaticamente ao abrir
	 * o TDS.</b>
	 */
	static final String RECONNECT_ONLY_SELECTED_SERVERS = "1"; //$NON-NLS-1$

	/**
	 * Politicas de reconexão de servidores.
	 */
	static final String RECONNECT_POLICIES = "server.reconect.policies"; //$NON-NLS-1$

	/**
	 * Opções de pré-compilação.
	 */
	static final String REPOSITORY_OPTIMIZATION = "server.repository.optimization"; //$NON-NLS-1$

	/**
	 * Opções de pré-compilação.<br/>
	 * <b>Prioriza o tamanho</b>
	 */
	static final String REPOSITORY_OPTIMIZATION_FOR_SPACE = "1"; //$NON-NLS-1$

	/**
	 * Opções de pré-compilação.<br/>
	 * <b>Prioriza a velocidade</b>
	 */
	static final String REPOSITORY_OPTMIZATION_FOR_SPEED = "0"; //$NON-NLS-1$

	/**
	 * Mostra progresso do AdvplAsp no Browser.
	 */
	static final String SHOW_ADVPLASP_CONTENT_PROGRESSIVELY = "server.advplasp.progress"; //$NON-NLS-1$

	/**
	 * The Old SmartClient (TotvsSmartClient) Linux executable file name.
	 */
	static final String TOTVSSMARTCLIENT_LINUX = "TotvsSmartClient"; //$NON-NLS-1$

	/**
	 * The Old SmartClient (TotvsSmartClient) Mac executable file name.
	 */
	static final String TOTVSSMARTCLIENT_MAC = "TotvsSmartClient.app"; //$NON-NLS-1$

	/**
	 * The Old SmartClient (TotvsSmartClient) Windows executable file name.
	 */
	static final String TOTVSSMARTCLIENT_WIN = "TotvsSmartClient.exe"; //$NON-NLS-1$

	/**
	 * Mostra resultados de pre-compilação.
	 */
	static final String SHOW_PRECOMPILATION_RESULTS = "server.precompilation.results"; //$NON-NLS-1$
	/**
	 * An array with all Smartclient executables of all platforms.
	 */
	/**
	 * The SmartClient Linux executable file name.
	 */
	static final String SMARTCLIENT_LINUX = "SmartClient"; //$NON-NLS-1$

	/**
	 * The SmartClient Mac executable file name.
	 */
	static final String SMARTCLIENT_MAC = "SmartClient.app"; //$NON-NLS-1$

	/**
	 * The SmartClient Windows executable file name.
	 */
	static final String SMARTCLIENT_WIN = "SmartClient.exe"; //$NON-NLS-1$

	/**
	 * Array with all valid SmartClients executable files for Linux platform.
	 */
	static final String[] SMARTCLIENT_EXECUTABLES_LINUX = { SMARTCLIENT_LINUX, TOTVSSMARTCLIENT_LINUX };
	/**
	 * Array with all valid SmartClients executable files for OSX platform.
	 */
	static final String[] SMARTCLIENT_EXECUTABLES_MAC = { SMARTCLIENT_MAC, TOTVSSMARTCLIENT_MAC };
	/**
	 * Array with all valid SmartClients executable files for Windows platform.
	 */
	static final String[] SMARTCLIENT_EXECUTABLES_WIN = { SMARTCLIENT_WIN, TOTVSSMARTCLIENT_WIN };

	static final String VERIFY_RPO = "server.verify.RPO"; //$NON-NLS-1$

	static final String _IS_ROOT = "group.is.root"; //$NON-NLS-1$

	static final String BUILD_VERSION = "build.version"; //$NON-NLS-1$

	static final String SMARTCLIENT_PATH = "smartclient.path"; //$NON-NLS-1$

	static final String IMMEDIATE_CONNECTION = "immediate.connection"; //$NON-NLS-1$

	static final String LAUNCH_PARAMETERS = "launch.parameters"; //$NON-NLS-1$

	static final String CANCELED = "*** CANCELED ***"; //$NON-NLS-1$

	static final String APP_SERVER_PATH = "app.server.path"; //$NON-NLS-1$

	static final String LOCAL_SERVER = "local.server"; //$NON-NLS-1$

	static final String PINNED = "pinned";

}
