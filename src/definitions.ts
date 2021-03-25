declare module '@capacitor/core' {
  interface PluginRegistry {
    Notification: NotificationPlugin;
  }
}

export interface NotificationPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
